import { useEffect, useState } from "react";
import ProductCard from "./ProductCard";
import { getRequest } from "./common/ApiUtils";
import { Product, useCart } from "../context/CartContext";

const ProductList = () => {
  const [products, setProducts] = useState<Product[]>([]);
  const { initialize } = useCart();
  useEffect(() => {
    initialize();
    getRequest("/api/product/list", setProducts);
  }, []);
  return (
    <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-6">
      {products?.map((product) => (
        <ProductCard key={product.id} product={product} />
      ))}
    </div>
  );
};

export default ProductList;
