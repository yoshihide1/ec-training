import React from "react";
import { ShoppingCart } from "lucide-react";
import { useCart, Product } from "../context/CartContext";
// 仮でサンプル画像
import SampleImage from "../img/sample.jpg";

interface ProductCardProps {
  product: Product;
}

const ProductCard: React.FC<ProductCardProps> = ({ product }) => {
  const { addToCart } = useCart();

  return (
    <div className="bg-white rounded-lg shadow-md overflow-hidden">
      <img
        src={SampleImage}
        alt={product.name}
        className="w-full h-48 object-cover"
      />
      <div className="p-4">
        <h2 className="text-lg font-semibold mb-2">{product.name}</h2>
        <p className="text-gray-600 mb-4">¥{product.price.toLocaleString()}</p>
        <button
          className="bg-blue-500 text-white px-4 py-2 rounded-full flex items-center justify-center w-full hover:bg-blue-600 transition-colors"
          onClick={() => addToCart(product)}
        >
          <ShoppingCart className="h-5 w-5 mr-2" />
          カートに追加
        </button>
      </div>
    </div>
  );
};

export default ProductCard;
