public class sb {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("check");
        sb ss = new sb();

        System.out.println(ss.change(s).toString());

    }

    public StringBuilder change(StringBuilder sb) {
        //sb.append("Success");
        //sb.insert(4, "hello");
      //  sb.reverse();
      sb.replace(1, 3, "rr");

        return sb;

    }

}
