import { HiFingerPrint } from "react-icons/hi";
const Check = (props) => {
  return (
    <div>
      <h2>{props.intro}</h2>
      <p>{props.param}</p>
      <HiFingerPrint size={500} />
    </div>
  );
};
export default Check;
