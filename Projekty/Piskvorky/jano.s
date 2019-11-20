;x86 bootloader, write to first sector of bootable media
bits 16
org 0x7c00

  mov sp, 1000h
  mov cl, 1
  mov [1998h], cl
  mov bx, write_width
write_enter:
  mov si, str_enter
  mov ah, 0Eh
print:
  lodsb
  or al,al
  jz jump_bx
  int 10h
  jmp print
jump_bx:
  push bx
  ret
write_width:
  mov si, str_width
  mov bx, read_width
  jmp print
read_width:
  mov si, 2000h
  mov bx, width_end
read_char:
  mov ah, 0h
  int 16h
  cmp al, 0h
  jg char_end
  jmp read_char
char_end:
  cmp al, 31h
  jl read_char
  cmp al, 39h
  jg read_char
  sub al, 30h
  cmp al, 1
  jne done
  add al, 9
done:
  mov [si], al
  jmp jump_bx
width_end:
  mov bx, write_height
  jmp write_enter
write_height:
  mov si, str_height
  mov bx, read_height
  jmp print
read_height:
  mov si, 2002h
  mov bx, height_end
  jmp read_char
height_end:
  mov bx, write_len
  jmp write_enter
write_len:
  mov si, str_len
  mov bx, read_len
  jmp print
read_len:
  mov si, 2004h
  mov bx, draw_map
  jmp read_char
draw_map:
  xor dx, dx
  mov ch, [2000h]
  mov cl, [2002h]
  mov di, 2006h
  mov ah, 0Eh
map_start:
  mov al, [di]
  mov bx, map_done
  cmp al, 1
  jg map_x
  jl map_n
  mov si, str_o
  jmp print
map_x:
  mov si, str_x
  jmp print
map_n:
  mov si, str_n
  jmp print
map_done:
  inc di
  inc dh
  cmp dh, ch
  jge map_next_y
  jmp map_start
map_next_y:
  xor dh,dh
  inc dl
  cmp dl, cl
  jge map_end
  mov bx, map_start
  mov si, str_end
  jmp print
map_end:
  mov bx, game_loop
  mov si, str_end
  jmp print
game_loop:
  mov bx, game_loop_rd
  jmp write_enter  
game_loop_rd:
  mov si, str_prx
  mov bx, game_loop_rd2
  jmp print
game_loop_rd2:
  mov cl, [1998h]
  mov bx, game_loop_xdone
game_loop_read:
  mov ah, 0h
  int 16h
  cmp al, 0h
  jg game_loop2
  jmp game_loop_read
game_loop2:
  cmp al, 30h
  jl game_loop_read
  cmp al, 39h
  jg game_loop_read
  sub al, 30h
  jmp jump_bx
game_loop_xdone:
  xor dh, dh
  mov dl, al
  mov bx, game_loop_rd3
  jmp write_enter  
game_loop_rd3:
  mov si, str_pry
  mov bx, game_loop_rd4
  jmp print
game_loop_rd4:
  mov bx, game_loop_ydone
  jmp game_loop_read
game_loop_ydone:
  xor ah, ah
  mul ch
  add dl, al
  add dx, 2006h
  mov bx, dx
  mov [bx], cl
  inc cl
  cmp cl, 3
  je fix_cl
game_loop_final:
  mov [1998h], cl
  jmp draw_map
fix_cl:
  mov cl, 1
  jmp game_loop_final
exit:
  mov ah, 0Eh
  mov al, 57h
  int 10h
  hlt
  jmp $

str_enter: db "Zadaj ", 0
str_width: db "sirku", 0xA, 0xD, 0
str_height: db "vysku", 0xA, 0xD, 0
str_prx: db "x", 0xA, 0xD, 0
str_pry: db "y", 0xA, 0xD, 0
str_len: db "vyhernu dlzku", 0xA, 0xD, 0
str_x: db "|X", 0
str_o: db "|O", 0
str_n: db "| ", 0
str_end: db "|", 0xA, 0xD, 0
times 510-($-$$) db 0
dw 0xAA55
