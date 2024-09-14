package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemNm(String itemNm);
    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail); // 상품명과 상품 상세 설명 이용하여 조회
    List<Item> findByPriceLessThan(Integer price); // price 변수보다 작은 상품 조회
    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price); // 상품의 가격이 높은 순으로 조회
}
