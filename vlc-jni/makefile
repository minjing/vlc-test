all: hello.exe

 clean:
     rm main.o hello.exe

 hello.exe: main.o
     gcc -g -o hello main.o

 main.o:
     gcc -c -g vlc-jni.c