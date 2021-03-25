public class Runner34_exm2 {
    public static void main(String[] args) {
        String str = "IT Class";
        //StringBuffer StringBuilder
        StringBuilder strBuilder1 = new StringBuilder();//16
        //method append adds values in StringBuilder
        strBuilder1.append(1);
        strBuilder1.append(1.6);
        strBuilder1.append('c');
        strBuilder1.append("IT Class");

        //переход от объекта StringBuilder к объекту String
        String result = strBuilder1.toString();
        System.out.println(result);

        //переход от String к StringBuilder
        StringBuilder strBuilder2 = new StringBuilder(str);
        System.out.println(strBuilder2);

        /////////
        //add by number of table asci
        strBuilder2.appendCodePoint(80);
        System.out.println(strBuilder2);
        //add a value in position of index
        strBuilder2.insert(0, "java");
        System.out.println(strBuilder2);
    }
}
