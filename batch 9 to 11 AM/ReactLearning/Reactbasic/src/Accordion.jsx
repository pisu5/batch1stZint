import { useState } from "react";
import { AiOutlineDown, AiOutlineUp } from "react-icons/ai";
import "./acc.css";

const Accordion = () => {
  const acc = [
    {
      question: "What is react",
      ans: "react is a popular framworks of js",
    },
    {
      question: "What is react",
      ans: "react is a popular framworks of js",
    },
    {
      question: "What is react",
      ans: "react is a popular framworks of js",
    },
    {
      question: "What is react",
      ans: "react is a popular framworks of js",
    },
  ];
  const [openIndex, setOpenIndex] = useState(null);
  const toggleAns = (index) => {
    setOpenIndex(openIndex == index ? null : index);
  };
  return (
    <>
      <div className="faq-acc">
        {acc.map((val, index) => (
          <div key={index} className="faq-item">
            <h3 onClick={() => toggleAns(index)} className="faq-question">
              {val.question}
              {openIndex == index ? (
                <AiOutlineUp className="up-icon" />
              ) : (
                <AiOutlineDown className="down-icon" />
              )}
            </h3>
            {openIndex == index && <p className="acc-ans">{val.ans}</p>}
          </div>
        ))}
      </div>
    </>
  );
};
export default Accordion;
