import React from "react";
import { Link, useNavigate } from "react-router-dom";
import { ShoppingCart, Search, Menu } from "lucide-react";
import { useCart } from "../context/CartContext";

const Header: React.FC = () => {
  const navigate = useNavigate();
  const { cart: cart } = useCart();
  console.log(cart);

  return (
    <header className="bg-white shadow-md">
      <div className="container mx-auto px-4 py-4 flex items-center justify-between">
        <div className="flex items-center">
          <Menu className="h-6 w-6 mr-4 cursor-pointer" />
          <Link to="/" className="text-xl font-bold">
            ECショップ
          </Link>
        </div>
        <div className="flex items-center">
          <div className="relative mr-4">
            <input
              type="text"
              placeholder="検索..."
              className="pl-8 pr-2 py-1 border rounded-full"
            />
            <Search className="h-4 w-4 absolute left-2 top-1/2 transform -translate-y-1/2 text-gray-400" />
          </div>
          <div className="relative">
            <ShoppingCart
              className="h-6 w-6 cursor-pointer"
              onClick={() => navigate("/cart")}
            />
            {cart.itemCount > 0 && (
              <span className="absolute -top-2 -right-2 bg-red-500 text-white rounded-full w-5 h-5 flex items-center justify-center text-xs">
                {cart.itemCount}
              </span>
            )}
          </div>
        </div>
      </div>
    </header>
  );
};

export default Header;
