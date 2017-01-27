# Java8Collections

## Difference between Array and List

> Array is collection of homogeneous elements.
> List is collection of heterogeneous elements.

> For Array memory allocated is static and continuous.
> For List memory allocated is dynamic and Random.

> In Arrays, User need not have to keep in track of next memory allocation.
> In List, User has to keep in Track of next location where memory is allocated.

> Array uses direct access of stored members.
> List uses sequencial access for members.

```
//With Array you have direct access to memory position 5
Object x = a[5]; 
```

```
//With the list you have to cross all previous nodes in order to get the 5th node:
list mylist;
list::iterator it;

for( it = list.begin() ; it != list.end() ; it++ )
{
if( i==5)
{
x = *it;
break;
}
i++;
}
```


