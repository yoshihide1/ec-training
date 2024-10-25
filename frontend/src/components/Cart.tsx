import React from "react";
import { ArrowLeft, Plus, Minus, Trash2 } from "lucide-react";
import { useNavigate } from "react-router-dom";
import { useCart } from "../context/CartContext";
// 仮でサンプル画像
import SampleImage from "../img/sample.jpg";

const Cart: React.FC = () => {
  const navigate = useNavigate();
  const {
    cart: cart,
    addToCart,
    removeFromCart,
    clearCart,
    getCartTotal,
  } = useCart();

  console.log(Array.isArray(cart.items));
  console.log(cart.items);
  return (
    <div className="bg-white rounded-lg shadow-md p-6">
      <div className="flex items-center mb-6">
        <ArrowLeft
          className="h-6 w-6 cursor-pointer mr-4"
          onClick={() => navigate("/")}
        />
        <h1 className="text-2xl font-bold">ショッピングカート</h1>
      </div>
      {cart.itemCount === 0 ? (
        <p className="text-gray-600">カートは空です。</p>
      ) : (
        <>
          {cart.items.map((item) => (
            <div
              key={item.product.id}
              className="flex items-center justify-between border-b py-4"
            >
              <div className="flex items-center">
                <img
                  src={SampleImage}
                  alt={item.product.name}
                  className="w-16 h-16 object-cover rounded mr-4"
                />
                <div>
                  <h3 className="font-semibold">{item.product.name}</h3>
                  <p className="text-gray-600">{item.product.category}</p>
                  <p className="text-gray-600">¥{item.product.price}</p>
                </div>
              </div>
              <div className="flex items-center">
                <button
                  className="p-1 rounded-full hover:bg-gray-200"
                  onClick={() => removeFromCart(item.product.id)}
                >
                  <Minus className="h-4 w-4" />
                </button>
                <span className="mx-2">{item.quantity}</span>
                <button
                  className="p-1 rounded-full hover:bg-gray-200"
                  onClick={() => addToCart(item.product)}
                >
                  <Plus className="h-4 w-4" />
                </button>
              </div>
            </div>
          ))}
          <div className="mt-6 flex justify-between items-center">
            <p className="text-xl font-semibold">
              合計: ¥{getCartTotal().toLocaleString()}
            </p>
            <div>
              <button
                className="bg-red-500 text-white px-4 py-2 rounded-full hover:bg-red-600 transition-colors mr-2"
                onClick={clearCart}
              >
                <Trash2 className="h-5 w-5" />
              </button>
              <button className="bg-blue-500 text-white px-6 py-2 rounded-full hover:bg-blue-600 transition-colors">
                購入する
              </button>
            </div>
          </div>
        </>
      )}
      <button
        className="mt-4 bg-gray-200 text-gray-800 px-4 py-2 rounded-full hover:bg-gray-300 transition-colors"
        onClick={() => navigate("/")}
      >
        買い物を続ける
      </button>
    </div>
  );
};

export default Cart;
