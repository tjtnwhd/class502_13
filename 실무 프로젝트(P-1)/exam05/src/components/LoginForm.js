import styled, { css } from 'styled-components';
/* {css} = 공통적인 스타일을 변수에 적용할때  */
import { BigButton } from './commons/ButtonStyle';

const commonStyle = css`
  width: 100%;
`;

const OuterBox = styled.div`
  ${commonStyle}
  position: fixed;
  height: 100%;
  left: 0;
  top: 0;
  display: flex;
  align-items: center;
`;

/* tagged 함수(FormBox) */
const FormBox = styled.form`
  width: 420px;
  margin: 0 auto;
  h1 {
    text-align: center;
  }
`;
/* tagged 함수(InputBox) ,(아래 scss스타일을 input 으로 넘겨준다.)*/
const InputBox = styled.input`
  ${commonStyle}
  display: block;
  height: 45px;
  border: 1px solid #ccc;
  border-radius: 5px;
  padding: 0 10px;
  & + & {
    margin-top: 5px;
  }
`;
/* 현재 요소 + 현재 요소 (&+&), (& = 현재 요소),(+ = 다음 태그), (+ = css문법),(& = scss문법)*/

const LoginForm = () => {
  return (
    <OuterBox>
      <FormBox autoComplete="off">
        <h1>로그인</h1>
        <InputBox type="text" placeholder="아이디" />
        <InputBox type="password" placeholder="비밀번호" />
        <BigButton type="submit" selected={true}>
          로그인
        </BigButton>
      </FormBox>
    </OuterBox>
  );
};

export default LoginForm;
