/*
 ============================================================================
 Name        : vlc-jni.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

#include <vlc/vlc.h>

int main(void) {
	puts("!!!Hello World!!!"); /* prints !!!Hello World!!! */

	puts(libvlc_get_version());

	return EXIT_SUCCESS;
}
