import PropTypes from 'prop-types';
const MyComponent = ({ name, num }) => {
  /*  비구조화 할당 더 짧게 가능 */
  /*console.log(Object.getOwnPropertyDescriptors(props))*/
  /* const { name } = props;   비구조화 할당 */

  return (
    <>
      <div>안녕하세요!, 제 이름은 {name} 입니다.</div>;
      <div>좋아하는 숫자는{num}입니다.</div>
    </>
  );
};

MyComponent.defaultProps = {
  /* 기본값 설정,  || 연산자로 가능*/
  name: '기본 이름',
};
MyComponent.PropTypes = {
  name: PropTypes.string,
  num: PropTypes.number.isRequired,
};

export default MyComponent;
