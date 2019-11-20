;x86 bootloader, write to first sector of bootable media
bits 16
org 0x7c00

  mov sp, 1000h
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
  mov bx, len_end
  jmp read_char
len_end:
  mov ah, 0Eh
  mov al, 57h
  int 10h
  hlt
  jmp $

str_enter: db "Enter ", 0
str_width: db "width (3-10)", 0xA, 0xD, 0
str_height: db "height (3-10)", 0xA, 0xD, 0
str_len: db "winning length", 0xA, 0xD, 0
str_x: db "|X", 0
str_o: db "|O", 0
str_n: db "| ", 0
str_end: db "|", 0xA, 0xD, 0
times 510-($-$$) db 0
dw 0xAA55
