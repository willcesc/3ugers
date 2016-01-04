
public class udregnz{
public static void main(String[] args) {
System.out.print(metode(3,3));
}
 public static int metode(int x, int y) {
		int z = 0;
	while (y > 0) {
	z = z + x;
	x = x + y;
	y--;
		}
 return z;
 
 }
}

 


/*
(3,3)=17


(3,3)

z=0+3
x=3+3
y=2

(6,2)

z=3+6
x=6+2
y=1


(8,1)

z=9+8
(*)
(*)






*/

/*
metode(6,0)=0
metode(8,1)=
metode(3,3)=
metode(4,2)=
metode(1,4)=
*/