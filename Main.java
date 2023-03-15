import java.util.Scanner;
class Main {
 public static void main(String[] args) {
 System.out.println("Podaj liczbę: ");
 Scanner in = new Scanner(System.in);
 int liczba = in.nextInt();
 int check=liczba;
 int takczynie=1;
 for(int i = 0;i<liczba && check>2;i++){
check--;
if(liczba%check==0){
 takczynie=0;
 } 
}
if(takczynie==0){
System.out.println("Liczba "+liczba+ " nie jest liczbą pierwszą.");
}
else{
System.out.println("Liczba "+liczba+ " jest liczbą pierwszą.");
}
}
  }