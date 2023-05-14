#include <stdio.h>
#include <conio.h>
#include <ctype.h>
#define NON 5
#define PERM 1
#define TEMP 0
struct node
{
    unsigned int wt;
    int prev;
    int state;
};
main()
{
    int table[NON][NON] =
    {
        {0,0,3,5,6},
        {0,0,1,2,7},
        {3,1,0,4,0},
        {5,2,4,0,0},
        {6,7,0,0,0},
    };
    int src,dest,workn,i;
    unsigned int min;
    struct node nodes[NON];
    //clrscr();
    for(i=0;i<NON;i++)
    {
        nodes[i].state=TEMP;
        nodes[i].wt=-1;
    }
    printf("\n enter source:");
    src=getche();
    workn=src=toupper(src)-'A';
    nodes[src].prev=-1;
    nodes[src].wt=0;
    printf("\n enter destination:");
    dest=toupper(getche())-'A';
    do
    {
        nodes[workn].state=PERM;
        for(i=0;i<NON;i++)
        {
            if(table[workn][i]!=0&&nodes[i].state==TEMP)
            {
                if(nodes[workn].wt+table[workn][i]<nodes[i].wt)
                {
                    nodes[i].wt=nodes[workn].wt+table[workn][i];
                    nodes[i].prev=workn;
                }
            }
        }
        min=-1;
        for(i=0;i<NON;i++)
        {
            if(nodes[i].state==TEMP&&nodes[i].wt<min)
            {
                min=nodes[i].wt;
                workn=i;
            }
        }
    }
    while(workn!=dest);
    printf("\n the shortest path got --> \n %c",dest+65);
    do
    {
        workn=nodes[workn].prev;
        printf("<--%c ",workn+65);
    }
    while(nodes[workn].prev!=-1);
    printf("\n at a total weight of :%d",nodes[dest].wt);
    getch();
}