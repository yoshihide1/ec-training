import React, { createContext, useContext, useState, ReactNode } from "react";
import {
  deleteRequest,
  getRequest,
  postRequest,
} from "../components/common/ApiUtils";

export interface Product {
  id: number;
  category: string;
  name: string;
  price: number;
  image: string;
}

interface CartItem extends Product {
  quantity: number;
}

interface Cart {
  items: CartItem[];
  itemCount: number;
}

interface CartContextType {
  cart: Cart;
  addToCart: (product: Product) => void;
  removeFromCart: (productId: number) => void;
  clearCart: () => void;
  getCartTotal: () => number;
  initialize: () => void;
}

const CartContext = createContext<CartContextType | undefined>(undefined);

export const useCart = () => {
  const context = useContext(CartContext);
  if (!context) {
    throw new Error("useCart must be used within a CartProvider");
  }
  return context;
};

export const CartProvider: React.FC<{ children: ReactNode }> = ({
  children,
}) => {
  const [cartItems, setCartItems] = useState<Cart | undefined>(undefined);

  const initialize = () => {
    getRequest("/api/cart/1", setCartItems); //TODO 仮で固定
  };

  const addToCart = (product: Product) => {
    console.log(product);
    postRequest("/api/cart/add", setCartItems, { productId: product.id });
  };

  const removeFromCart = (productId: number) => {
    console.log(productId);
    postRequest(`/api/cart/remove/${productId}`, setCartItems);
    // setCartItems((prevItems) =>
    //   prevItems.reduce((acc, item) => {
    //     if (item.productId === productId) {
    //       if (item.quantity > 1) {
    //         acc.push({ ...item, quantity: item.quantity - 1 });
    //       }
    //     } else {
    //       acc.push(item);
    //     }
    //     return acc;
    //   }, [] as CartItem[])
    // );
  };

  /**
   * カート内の商品をすべて削除する
   */
  const clearCart = () => {
    deleteRequest("/api/cart/remove/all", setCartItems);
  };

  //TODO 後で実装
  const getCartTotal = () => {
    return 0;
    // return cartItems.reduce(
    //   (total, item) => total + item.price * item.quantity,
    //   0
    // );
  };

  return (
    <CartContext.Provider
      value={{
        cart: cartItems || { items: [], itemCount: 0 }, // undefined時のデフォルトを設定,
        addToCart,
        removeFromCart,
        clearCart,
        getCartTotal,
        initialize,
      }}
    >
      {children}
    </CartContext.Provider>
  );
};
