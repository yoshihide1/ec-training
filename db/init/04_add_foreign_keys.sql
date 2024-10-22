-- 外部キー制約を追加
ALTER TABLE order_items ADD CONSTRAINT fk_order_items_orders FOREIGN KEY (order_id) REFERENCES orders (id) ON DELETE CASCADE;

ALTER TABLE order_items ADD CONSTRAINT fk_order_items_products FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE;

ALTER TABLE inventory ADD CONSTRAINT fk_inventory_products FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE;

ALTER TABLE payments ADD CONSTRAINT fk_payments_orders FOREIGN KEY (order_id) REFERENCES orders (id) ON DELETE CASCADE;

ALTER TABLE carts ADD CONSTRAINT fk_carts_users FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE;

ALTER TABLE cart_items ADD CONSTRAINT fk_cart_items_carts FOREIGN KEY (cart_id) REFERENCES carts (id) ON DELETE CASCADE;

ALTER TABLE cart_items ADD CONSTRAINT fk_cart_items_products FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE;