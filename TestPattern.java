/* 1. public class TestPattern{
public static void main(String[] args) {
for (int i = 0; i < 6; i++) {
 for (int j = 0; j < 6; j++) {
 System.out.print("* ");
 }
            
System.out.println();
}
}
}*/




/* 2.public class TestPattern{
public static void main(String[] args) {
for (int i = 1; i <= 5; i++) {
for (int j = 1; j <= 5; j++) {
System.out.print(i + " ");
}
System.out.println();
     }
    }
}*/



/*3.public class TestPattern{
    public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
           
    for (int j = 1; j <= 5; j++) {
     System.out.print(j + " ");
            }
     System.out.println();
        }
    }
}*/




/*4.public class TestPattern{
    public static void main(String[] args) {
        int count = 1; // Start from 1

                for (int i = 1; i <= 5; i++) {
           
            for (int j = 1; j <= 5; j++) {
                System.out.print(count + "\t"); 
                count++;
            }
            System.out.println(); 
        }
    }
}*/




/*5.public class TestPattern{
    public static void main(String[] args) {
        int num = 1;

        
        for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
                System.out.print(num + "\t");
                num += 2; 
            }
            System.out.println();
        }
    }
}*/

/*6.public class TestPattern{
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                
                if (j % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();         }
    }
}*/



/*7public class TestPattern{
    public static void main(String[] args) {
        int n = 5; // Number of rows

        
        for (int i = 1; i <= n; i++) {
            // Print spaces before stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

                        for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            
            System.out.println();
        }
    }
}*/

/* 9
public class TestPattern{
    public static void main(String[] args) {
        int n = 5;          
        for (int i = 1; i <= n; i++) {
            
            for (int space = i; space < n; space++) {
                System.out.print(" ");
            }
            
            
            for (int j = 1; j <= i; j++) {
                System.out.print((j * 2) + " ");
            }
            
                        System.out.println();
        }
    }
}*/



/* 10.public class TestPattern{
    public static void main(String[] args) {
        String word = "INDIA";
        int n = word.length();

        for (int i = 1; i <= n; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}*/





/* 11.public class TestPattern{
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
           
            for (int space = n - i; space > 0; space--) {
                System.out.print("  ");
            }

            
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("* ");
            }

                        System.out.println();
        }
    }
}*/




/* 12.public class TestPattern{
    public static void main(String[] args) {
        int n = 4; // top half height

                for (int i = 1; i <= n; i++) {
            int spaces = 13 - 2 * i;  // Adjust spaces to approximate your pattern
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

                for (int i = n - 1; i >= 1; i--) {
            int spaces = 13 - 2 * i;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/



/*13.public class TestPattern{
    public static void main(String[] args) {
        int n = 4;  // half the diamond height including middle row

                for (int i = 1; i <= n; i++) {
                        for (int j = n; j > i; j--) {
                System.out.print("  ");
            }

                        System.out.print("*");

            
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
                       for (int j = n; j > i; j--) {
                System.out.print("  ");
            }

           
            System.out.print("*");

                        if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/



/* 14.public class TestPattern{
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // spaces inside
                }
            }
            System.out.println();
        }
    }
}*/


/* 15.public class TestPattern{
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("      *");
        }

        
        System.out.println(" * * * * * * *");

        
        for (int i = 1; i <= 2; i++) {
            System.out.println("      *");
        }

                System.out.println("       *");
    }
}*/




/* 16.public class TestPattern{
    public static void main(String[] args) {
        int n = 7; 
        int mid = n / 2; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
            if (j == Math.abs(mid - i) || j == n - 1 - Math.abs(mid - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/




/* 17.public class TestPattern{
    public static void main(String[] args) {
       
        System.out.println("* * * * * * *");

        
        for (int i = 0; i < 2; i++) {
            System.out.println("*        *       *");
        }

                System.out.println("* * * * * * *");

        
        for (int i = 0; i < 2; i++) {
            System.out.println("*        *       *");
        }

                System.out.println(" * * * * * * *");
    }
}*/

/* 18.public class TestPattern{
    public static void main(String[] args) {
        int n = 7; // total number of rows (starts from full line)

        for (int i = 0; i < n; i++) {
            
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            } else {
                                System.out.print("*");

                // Print inner spaces
                for (int j = 0; j < (2 * (n - i - 1)) + 1; j++) {
                    System.out.print(" ");
                }

                
                if (i != n - 1) {
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to next line
        }
    }
}*/



/*19.public class TestPattern{
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

             System.out.println(i);
        }
    }
}*/





public class TestPattern{
public static void main(String[] args) {
int totalRows = 7;

for (int i = 1; i <= totalRows; i++) {
if (i == 1) {
                
for (int j = 1; j <= totalRows; j++) {
  System.out.print("* ");
                }
 } else if (i == 2) {
                
 System.out.print("* *");
            } else {
               
System.out.print("*");
 for (int s = 1; s <= (2 * (i - 2) + 1); s++) {
    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}










 





















