class StringDemo{
    public static void main(String[] args) {
        
        System.out.println("---------------Concat ---------------------------");
        String s="Hinduja";
        System.out.println(s);
        s=s.concat(" College");
        System.out.println(s);

        String str="java";
        str= str.toUpperCase();
        System.out.println(str);

        System.out.println("---------------Length ---------------------------");

        int l=s.length();
        System.out.println("Length of String "+s+" is "+l);

        System.out.println("---------------Equality ---------------------------");

        String s3="Tom";
        String s4="Tom";
        String s5="tom";

        System.out.println(s3.equals(s4)); //Checks for exact same string including cases
        System.out.println(s3.equals(s5)); //Checks for exact same string including cases
        System.out.println(s3.equalsIgnoreCase(s5)); //Checks for exact same string excluding cases

        System.out.println("---------------Trims and Empty Checks ---------------------------");

        String s6="Code With Z    ";
        System.out.println(s6);
        System.out.println(s6.length());
        s6=s6.trim();
        System.out.println(s6);
        System.out.println(s6.length());

        String s7="";
        System.out.println("Is s6 empty? "+s6.isEmpty());
        System.out.println("Is s7 empty? "+s7.isEmpty());

        System.out.println("---------------Indexes and Char Ats ---------------------------");

        String s8="Standard";

        char c2=s8.charAt(2);
        System.out.println("Char at index 2 is "+c2);

        // char c3=s8.charAt(20);
        // System.out.println("Char at index 2 is "+c3);

        int i1=s8.indexOf("d");
        System.out.println("Index of d is "+i1);

        int i2=s8.indexOf("d", i1+1);
        System.out.println("Index of second d is "+i2);
        

        int i3=s8.indexOf("z");
        System.out.println("Index of z in Standard is "+i3);

        System.out.println("---------------Upper and Lower Cases--------------------------");

        String s9="hinduja";
        String s10="HINDUJA";

        System.out.println("s9:"+s9);
        System.out.println("s10:"+s10);
        s9=s9.toUpperCase();
        s10=s10.toLowerCase();
        System.out.println("s9:"+s9);
        System.out.println("s10:"+s10);

        System.out.println("---------------Replace  and Split Cases--------------------------");

        String s11="Jxvx";
        System.out.println(s11);
        s11=s11.replaceAll("x", "a");
        System.out.println(s11);

        System.out.println("---------------Substring--------------------------");

        String x="Hamburger";
        String x1=x.substring(3);
        System.out.println("x:"+x);
        System.out.println("x1:"+x1);

        String x2=x.substring(4, 8);
        System.out.println("x2:"+x2);

        System.out.println("---------------String Buffer--------------------------");

        String name="John";
        StringBuffer sb=new StringBuffer(name);
        System.out.println(sb);
        sb.append("ny");
        System.out.println(sb);
        String appendedName=sb.toString();
        System.out.println(appendedName);



    }
}

