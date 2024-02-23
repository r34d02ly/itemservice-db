package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity                 // JPA가 사용하는 객체. 이 어노테이션이 있어야 jpa가 인식 가능
//@Table(name="item")  //객체명과 테이블명이 같으면 생략가능
public class Item {

    // @Id : 테이블의 pk와 해당 필드를 매핑
    // GenerationType.IDENTITY : DB에서 증가된 idx값을 사용한다.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="item_name", length = 10)
    private String itemName;

    private Integer price;
    private Integer quantity;

    // jpa를 쓰려면 기본 생성자 필수
    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
