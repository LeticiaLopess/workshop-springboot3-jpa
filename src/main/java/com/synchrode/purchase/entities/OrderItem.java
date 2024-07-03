package com.synchrode.purchase.entities;

import java.io.Serializable;
import java.util.Objects;

import com.synchrode.purchase.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id;
	
	private Integer quantity;
	private Double price;
	
	public OrderItem() {
	}

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		super();
		id.setOrder(order); // aqui associamos o order a esse OrderItem
		id.setProduct(product); // aqui associamos o product a esse OrderItem
		this.quantity = quantity;
		this.price = price;
	} 
	// não criamos com o id mas colocaremos ele manualmente

	public Order getOrder() { // fazemos isso pois essa classe de associação não retornará um ID sendo uma classe composta, ela deve retornar cada um separadamente
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() { // mesma coisa pro Product
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		id.setProduct(product);
	}
	
	private Integer getQuantity() {
		return quantity;
	}

	private void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	private Double getPrice() {
		return price;
	}

	private void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
