import React from 'react';

const Footer: React.FC = () => {
  return (
    <footer className="bg-gray-800 text-white py-8">
      <div className="container mx-auto px-4">
        <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
          <div>
            <h3 className="text-lg font-semibold mb-4">ECショップについて</h3>
            <ul className="space-y-2">
              <li><a href="#" className="hover:text-gray-300">会社概要</a></li>
              <li><a href="#" className="hover:text-gray-300">採用情報</a></li>
              <li><a href="#" className="hover:text-gray-300">プライバシーポリシー</a></li>
            </ul>
          </div>
          <div>
            <h3 className="text-lg font-semibold mb-4">カスタマーサービス</h3>
            <ul className="space-y-2">
              <li><a href="#" className="hover:text-gray-300">お問い合わせ</a></li>
              <li><a href="#" className="hover:text-gray-300">返品・交換について</a></li>
              <li><a href="#" className="hover:text-gray-300">FAQ</a></li>
            </ul>
          </div>
          <div>
            <h3 className="text-lg font-semibold mb-4">フォローする</h3>
            <ul className="space-y-2">
              <li><a href="#" className="hover:text-gray-300">Twitter</a></li>
              <li><a href="#" className="hover:text-gray-300">Facebook</a></li>
              <li><a href="#" className="hover:text-gray-300">Instagram</a></li>
            </ul>
          </div>
        </div>
        <div className="mt-8 text-center">
          <p>&copy; 2024 ECショップ. All rights reserved.</p>
        </div>
      </div>
    </footer>
  );
};

export default Footer;