import { useState } from 'react';
import {
  MdOutlineCheckBox,
  MdOutlineCheckBoxOutlineBlank,
} from 'react-icons/md';

const intialValue = [
  { title: '할일1', done: false },
  { title: '할일2', done: true },
  { title: '할일3', done: false },
];

const Todos = () => {
  const [items, setItems] = useState(intialValue);
  const onToggle = (id) => {
    const newItems = items.map((item) =>
      item.id === id ? { ...item, done: !item.done } : item,
    );
    setItems(newItems);
  };
  //   const listItems = items.map((item) => <li>{item.title}</li>);
  //   console.log(listItems);
  return (
    <ul>
      {items.map(({ id, title, done }) => (
        <li key={id} onClick={() => onToggle(id)}>
          {done ? <MdOutlineCheckBox /> : <MdOutlineCheckBoxOutlineBlank />}
          {title}
        </li>
      ))}
    </ul>
  );
};
export default Todos;
