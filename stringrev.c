#include <string.h>
#include <stdio.h>

int main () 
{
   char str[50],*bef,*aft;
   const char s[2] = "-";
   int i=0;
   char *token;
   fgets(str,50,stdin);

   token = strtok(str, s);
   while( token != NULL )
    {
      bef[i]=&token[i];
      i++;
     printf("\n%s",token);
      token= strtok('\0', s);

   }
   for(i=0;i<3;i++)
   {
      printf("%s",bef[i]);
   }
   
   return(0);
}