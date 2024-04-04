import {
  MdOutlineCheckBox,
  MdOutlineCheckBoxOutlineBlank,
} from 'react-icons/md';

const items = [
  { title: '할일1', done: false },
  { title: '할일2', done: true },
  { title: '할일3', done: false },
];

const Todos = () => {
  //   const listItems = items.map((item) => <li>{item.title}</li>);
  //   console.log(listItems);
  return (
    <ul>
      {items.map(({ id, title, done }) => (
        <li key={id}>
          {done ? <MdOutlineCheckBox /> : <MdOutlineCheckBoxOutlineBlank />}
          {title}
        </li>
      ))}
    </ul>
  );
};
export default Todos;
