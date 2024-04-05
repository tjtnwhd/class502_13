/*  - 컨테이너 컴포넌트 : 데이터 처리, 이벤트 처리 */
import { useEffect } from 'react';
import { MdOutlineAdd } from 'react-icons/md';
const AddTodo = ({ onSubmit, onChange, todo, message }) => {
  /*  */
  /* 변화 감지 기준 */
  /* 처음 렌더링 됬을때componentDidMount(), 재 렌더링 됬을때componentDidUpdate와 같은 역할 */
  //todo값의 변화에 의한 렌더링
  useEffect(() => {
    console.log('todo,message 값 변경- 렌더링 후'); //두번째 실행
    return () => {
      console.log('뒷정리 함수 ..../update'); //첫번째 실행(뒷정리 함수)
    };
  }, [todo, message]);

  useEffect(() => {
    console.log('마운트시 한번만 호출'); // componentDidMount()
    // DOMContentLoaded 비슷(동일 X)
  }, []);

  // componentDidMount(), componentDidUpdate - message
  // useEffect(() => {
  //   console.log('message 값 변경');
  // }, [message]);
  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input type="text " value={todo ?? ''} onChange={onChange} />
      <button type="submit">
        <MdOutlineAdd />
      </button>

      {message && <div>{message}</div>}
    </form>
  );
};
export default AddTodo;
