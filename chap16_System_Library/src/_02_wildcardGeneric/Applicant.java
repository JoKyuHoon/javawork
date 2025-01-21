package _02_wildcardGeneric;

public class Applicant<T> {
    T kind;

    // 생성자
    Applicant(T kind) {
        this.kind = kind;
    }
    
    
}