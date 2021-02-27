import java.util.Scanner;
import java.util.Random;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    Random rand = new Random();
    String name;
    String cheerup;
    
    System.out.print("What's your first name?");
    name = readin.nextLine();
    
    for(int y = 0; y< name.length() ; y++){
    System.out.print(toUpper(name.charAt(y)) + " - ");
    
    if (toUpper(name.charAt(y))=='A'||toUpper(name.charAt(y))=='a'){
      System.out.println(bleh(1));
    }else
    if (toUpper(name.charAt(y))=='B'||toUpper(name.charAt(y))=='b'){
      System.out.println(bleh(2));
    }else
    if (toUpper(name.charAt(y))=='C'||toUpper(name.charAt(y))=='c'){
      System.out.println(bleh(3));
    }else
    if (toUpper(name.charAt(y))=='D'||toUpper(name.charAt(y))=='d'){
      System.out.println(bleh(4));
    }else
    if (toUpper(name.charAt(y))=='E'||toUpper(name.charAt(y))=='e'){
      System.out.println(bleh(5));
    }else
    if (toUpper(name.charAt(y))=='F'||toUpper(name.charAt(y))=='f'){
      System.out.println(bleh(6));
    }else
    if (toUpper(name.charAt(y))=='G'||toUpper(name.charAt(y))=='g'){
      System.out.println(bleh(7));
    }else
    if (toUpper(name.charAt(y))=='H'||toUpper(name.charAt(y))=='h'){
      System.out.println(bleh(8));
    }else
    if (toUpper(name.charAt(y))=='I'||toUpper(name.charAt(y))=='i'){
      System.out.println(bleh(9));
    }else
    if (toUpper(name.charAt(y))=='J'||toUpper(name.charAt(y))=='j'){
      System.out.println(bleh(10));
    }else
    if (toUpper(name.charAt(y))=='K'||toUpper(name.charAt(y))=='k'){
      System.out.println(bleh(11));
    }else
    if (toUpper(name.charAt(y))=='L'||toUpper(name.charAt(y))=='l'){
      System.out.println(bleh(12));
    }else
    if (toUpper(name.charAt(y))=='M'||toUpper(name.charAt(y))=='m'){
      System.out.println(bleh(13));
    }else
    if (toUpper(name.charAt(y))=='N'||toUpper(name.charAt(y))=='n'){
      System.out.println(bleh(14));
    }else
    if (toUpper(name.charAt(y))=='O'||toUpper(name.charAt(y))=='o'){
      System.out.println(bleh(15));
    }else
    if (toUpper(name.charAt(y))=='P'||toUpper(name.charAt(y))=='p'){
      System.out.println(bleh(16));
    }else
    if (toUpper(name.charAt(y))=='Q'||toUpper(name.charAt(y))=='q'){
      System.out.println(bleh(17));
    }else
    if (toUpper(name.charAt(y))=='R'||toUpper(name.charAt(y))=='r'){
      System.out.println(bleh(18));
    }else
    if (toUpper(name.charAt(y))=='S'||toUpper(name.charAt(y))=='s'){
      System.out.println(bleh(19));
    }else
    if (toUpper(name.charAt(y))=='T'||toUpper(name.charAt(y))=='t'){
      System.out.println(bleh(20));
    }else
    if (toUpper(name.charAt(y))=='U'||toUpper(name.charAt(y))=='u'){
      System.out.println(bleh(21));
    }else
    if (toUpper(name.charAt(y))=='V'||toUpper(name.charAt(y))=='v'){
      System.out.println(bleh(22));
    }else
    if (toUpper(name.charAt(y))=='W'||toUpper(name.charAt(y))=='w'){
      System.out.println(bleh(23));
    }else
    if (toUpper(name.charAt(y))=='X'||toUpper(name.charAt(y))=='x'){
      System.out.println(bleh(24));
    }else
    if (toUpper(name.charAt(y))=='Y'||toUpper(name.charAt(y))=='y'){
      System.out.println(bleh(25));
    }else
    if (toUpper(name.charAt(y))=='Z'||toUpper(name.charAt(y))=='z'){
      System.out.println(bleh(26));
    }
    
    }

  }
  
  public static char toUpper(char letter){
    
    char caps[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    char lower[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    Random rand = new Random();
    
    for (int i = 0; i<26; i++){
      if(caps[i]==letter){
        blah(i);
      }else if(lower[i]==letter){
        letter = caps[i];
      }
    }
 return letter;
  }
  
  public static int blah(int y){
    Random rand = new Random();
    int bob = 0;
    
    return bob;
  }
  
  public static String bleh(int fly){
    int word = 0;
    Random rand = new Random();
    int banana;
    String lit = "tra la la";
    
    while(fly>0 && fly <27){
    if (fly == 1){
      word = rand.nextInt(2+0);
     String a[] = {"Awesome", "Amazing", "Analytical"};
     return a[word];
    } else
    if (fly == 2){
      word = rand.nextInt(2+0);
      String b[] = {"Big", "Bubbly", "Brainy"};
      return b[word];
    } else
    if (fly == 3){
      word = rand.nextInt(2+0);
      String c[] = {"Cautious", "Caring", "Calm"};
      return c[word];
    } else
    if (fly == 4){
      word = rand.nextInt(2+0);
      String d[] = {"Dependable", "Devoted", "Diplomatic"};
      return d[word];
    } else
    if (fly == 5){
      word = rand.nextInt(2+0);
      String e[] = {"Eloquent", "Erudite", "Exhuberant"};
      return e[word];
    } else
    if (fly == 6){
      word = rand.nextInt(2+0);
      String f[] = {"Funny", "Friendly", "Fair"};
      return f[word];
    } else
    if (fly == 7){
      word = rand.nextInt(2+0);
      String g[] = {"Grateful", "Generous", "Gregarious"};
      return g[word];
    } else
    if (fly == 8){
      word = rand.nextInt(2+0);
      String h[] = {"Hopeful", "Happy", "Heroic"};
      return h[word];
    } else
    if (fly == 9){
      word = rand.nextInt(2+0);
      String i[] = {"Intelligent", "Imaginative", "Invaluable"};
      return i[word];
    } else
    if (fly == 10){
      word = rand.nextInt(2+0);
      String j[] = {"Jubilant", "Joyful", "Judicious"};
      return j[word];
    } else
    if (fly == 11){
      word = rand.nextInt(2+0);
      String k[] = {"Kind", "Keen", "Knowledgeable"};
      return k[word];
    } else
    if (fly == 12){
      word = rand.nextInt(2+0);
      String l[] = {"Loving", "Lenient", "Lively"};
      return l[word];
    } else
    if (fly == 13){
      word = rand.nextInt(2+0);
      String m[] = {"Mature", "Merciful", "Meticulous"};
      return m[word];
    } else
    if (fly == 14){
      word = rand.nextInt(2+0);
      String n[] = {"Nurturing", "Natural", "Nice"};
      return n[word];
    } else
    if (fly == 15){
      word = rand.nextInt(2+0);
      String o[] = {"Observant", "Omniscient", "Optimistic"};
      return o[word];
    } else
    if (fly == 16){
      word = rand.nextInt(2+0);
      String p[] = {"Patient", "Persuasive", "Passionate"};
      return p[word];
    } else
    if (fly == 17){
      word = rand.nextInt(2+0);
      String q[] = {"Quaint", "Quiet", "Quirky"};
      return q[word];
    } else
    if (fly == 18){
      word = rand.nextInt(2+0);
      String r[] = {"Rational", "Reasonable", "Responsible"};
      return r[word];
    } else
    if (fly == 19){
      word = rand.nextInt(2+0);
      String s[] = {"Strong", "Sagacious", "Scholarly"};
      return s[word];
    } else
    if (fly == 20){
      word = rand.nextInt(2+0);
      String t[] = {"Tactful", "Terrific", "Tranquil"};
      return t[word];
    } else
    if (fly == 21){
      word = rand.nextInt(2+0);
      String u[] = {"Understanding", "Upbeat", "Unique"};
      return u[word];
    } else
    if (fly == 22){
      word = rand.nextInt(2+0);
      String v[] = {"Virtuous", "Vigilant", "Valuable"};
      return v[word];
    } else
    if (fly == 23){
      word = rand.nextInt(2+0);
      String w[] = {"Whimsical", "Wacky", "Wholesome"};
      return w[word];
    } else
    if (fly == 24){
      word = rand.nextInt(2+0);
      String x[] = {"Xenial", "Xenodochial"};
      return x[word];
    } else
    if (fly == 25){
      word = rand.nextInt(2+0);
      String y[] = {"Young", "Youthful"};
      return y[word];
    } else
    if (fly == 26){
      word = rand.nextInt(2+0);
      String z[] = {"Zestful", "Zany", "Zealous"};
      return z[word];
    }
    }
    return lit;
  }
  
}
