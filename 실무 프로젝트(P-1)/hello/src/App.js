import { Fragment } from 'react';

const App = () => {
  const name = 'React';
  const style = {
    backgroundColor: 'orange',
    color: 'white',
    height: '100px',
  };
  return (
    /* 속성명에 - 안됨 , 대문자로 연결 */
    /* 단일태그로 해야함, 두개 일떄 하나로 감싼다. */
    /* Fragment 사용하면 노출 X , <> </> 로 생략 가능*/
    /* <input></input>를, <input/>으로 생략 가능 */
    /* 주석.... */
    <>
      <div className="subject" style={style}>
        첫번째 컴포넌트!!
      </div>
      <div style={{ color: 'blue' }}>신나는 ,{name && name} 리액트 공부</div>
      {name === 'React' && <h1>아 재미있다!</h1>}
      <input
        // 주석...
        type="text"
      />
    </>
  );
};

export default App;
