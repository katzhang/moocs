#include <stdio.h>

int main(int argc, char ** argv){
	int i = 1;
	printarg:
    if (i < argc) {
    	printf("%s\n", argv[i]);
    	i++;
    	goto printarg;
    } else {
    	goto end;
    }
    end:
    return 0;
}