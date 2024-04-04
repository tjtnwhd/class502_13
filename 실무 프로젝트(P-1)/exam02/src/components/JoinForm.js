import { useState, useEffect, useRef } from 'react';
const JoinForm = (props) => {
  const [form, setForm] = useState({});
  let userIdEl = useRef(); /* DOM 객체 사용 */
  useEffect(() => {
    // userIdEl.focus();
    console.log(userIdEl.current);
  }, [userIdEl]);

  //   const [userId, setUserId] = useState('');
  //   const [userPw, setUserPw] = useState('');
  //   const onUserIdChange = (e) => setUserId(e.currentTarget.value);
  //   const onUserPwChange = (e) => setUserPw(e.currentTarget.value);
  const onChange = (e) => {
    const name = e.currentTarget.name;
    const value = e.currentTarget.value;
    setForm((prevForm) => ({ ...prevForm, [name]: value }));
    // form[e.currentTarget] = e.currentTarget.value;
    // setForm({ ...form, [e.currentTarget.name]: e.currentTarget.value });
    // setForm(newForm); /* 불필요한 객체 X */
    // console.log(form === newForm);  /* 깊은 복사(주소 다름) DOM 재실행 X */
    // form[e.currentTarget.name] = e.currentTarget.value;
    // setForm({
    // //   ...form,
    // //   [e.currentTarget.name]: e.currentTarget.value,
    // }); /* 새로운 form 생성 */
    // setForm((proevForm) => ({
    //   ...proevForm,
    //   [e.currentTarget.name]: e.currentTarget.value,
    //   /* e.currentTarget === this  document 객체*/
    // }));
  };
  const onSubmit = (e) => {
    e.preventDefault();
    /* 처리 완료 */
    /* 양식 값을 비워주기 */
    setForm({});
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디({form.userId})</dt>
        <dd>
          <input
            type="text"
            name="userId"
            onChange={onChange}
            value={form.userId ?? ''}
            ref={userIdEl}
            // ref={(ref) => (userIdEl = ref)} /* DOM 객채 사용(ref) */
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            name="userPw"
            onChange={onChange}
            value={form.userPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input
            type="password"
            name="confirmPw"
            onChange={onChange}
            value={form.confirmPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input
            type="text"
            name="userNm"
            onChange={onChange}
            value={form.userNm ?? ''}
          />
        </dd>
      </dl>

      <div>
        <button type="submit">가입하기</button>
      </div>
    </form>
  );
};

export default JoinForm;
