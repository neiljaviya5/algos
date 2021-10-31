
#include <stdio.h>

void main()
{
    int key;
    char plain_text[80];
    int i=0;
    printf("enter the text:\t");
    scanf("%s",plain_text);
    printf("enter the key:\t");
    scanf("%d",&key);
    printf("Encrypted Text\t:");
   for(i=0;plain_text[i]!=NULL;i++)
   {     
       plain_text[i]=plain_text[i]+key;
      printf("%c",plain_text[i]);
    }
    
    
}
