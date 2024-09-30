import React, { useState } from "react";
import { Link } from "react-router-dom";
const Header = () => {
  const [isOpen, setIsOpen] = useState(false);
  const [isLightMode, setMode] = useState(true);
  return (                                      
    <>
      <header className="bg-blue-600 w-full">
        <div>
          <h1 className="text-white text-2xl md:m-4">My Responsive Design</h1>
          <button
            onClick={() => setIsOpen(!isOpen)}
            className="
        text-white focus:outline-none md:hidden "
          >
            @
          </button>
          {/* nav for larger screen*/}
          <nav className="hidden md:flex space-x-4">
            <Link to="/" className="text-white hover:underline">
              Home
            </Link>

            <Link to="/about-us" className="text-white hover:underline">
              About us
            </Link>

            <Link to="/shop-now" className="text-white hover:underline">
              Shop Now
            </Link>

            <Link to="/order-now" className="text-white hover:underline">
              Order Now
            </Link>

            <Link to="/see-magic" className="text-white hover:underline">
              See magic
            </Link>

            <button>Switch Mode</button>
          </nav>
        </div>

        {isOpen && (
          <nav className="md:hidden mt-4">
            <ul className="flex flex-col space-y2">
              <li>
                <Link to="/" className="text-white hover:underline">
                  Home
                </Link>
              </li>
              <li>
                <Link to="/about-us" className="text-white hover:underline">
                  About us
                </Link>
              </li>
              <li>
                <Link to="/shop-now" className="text-white hover:underline">
                  Shop Now
                </Link>
              </li>
              <li>
                <Link to="/order-now" className="text-white hover:underline">
                  Order Now
                </Link>
              </li>
              <li>
                <Link to="/see-magic" className="text-white hover:underline">
                  See magic
                </Link>
              </li>
              <li>
                <button>Switch Mode</button>
              </li>
            </ul>
          </nav>
        )}
      </header>
    </>
  );
};
export default Header;
