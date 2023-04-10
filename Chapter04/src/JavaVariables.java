public class JavaVariables {
    private int instanceVariable;

    private static int classVariable;

    public void method(String[] parameters) {
        int localVariable = this.instanceVariable;
    }

    public static void main(String[] args) {
        System.out.println("Java의 변수는 총 4가지가 있다.");
        System.out.println("1) 클래스 변수 vs 2) 인스턴스 변수");
        System.out.println("3) Parameter vs 4) 지역 변수");
        System.out.println("각 변수는 생명주기와 용도가 다르다");
    }
}
