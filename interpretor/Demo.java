public class Demo {

    public static Expression getTaarakExpression() {
        Expression daya = new TerminalExpression("daya");
        Expression jetha = new TerminalExpression("jetha");
        return new OrExpression(daya, jetha);
    }

    public static Expression getGadaExpression() {
        Expression baapuji = new TerminalExpression("baapuji");
        Expression jetha = new TerminalExpression("jetha");
        return new AndExpression(baapuji, jetha);
    }

    public static void main(String[] args) {
        Expression inTaarak = getTaarakExpression();
        Expression ingadafam = getGadaExpression();

        System.out.println("\n\n\n");
        System.out.println("daya or jetha in taarak ?--->" + inTaarak.interpret("daya"));

        System.out.println("Do bhide and jetha belong to the same fam ?--->" + ingadafam.interpret("bhide"));
    }
}
