package _01_generic;

class Box {
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

class Apple {
    int num = 10;
}

class Banana {
    boolean bool = true;
}

public class T01_NonGeneric {

    public static void main(String[] args) {
        // Box with String
        Box box = new Box();
        box.setObj("홍길동");
        Object obj = box.getObj();
        System.out.println(obj); // String 클래스는 toString을 오버라이딩 해놓은 상태

        // Box with Apple
        box.setObj(new Apple());
        Apple obj2 = (Apple) box.getObj(); // 다운캐스팅
        System.out.println(obj2.num); // Apple의 필드 출력

        // Box with Banana
        box.setObj(new Banana());
        Banana b = (Banana) box.getObj(); // 다운캐스팅
        System.out.println(b.bool); // Banana의 필드 출력
    }
}
