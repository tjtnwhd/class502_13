import { Component } from 'react';

class Color extends Component {
  state = {
    color: 'blue',
    subColor: 'black',
  };
  //   changeColor(color) {
  //     console.log(this);
  //   }
  render() {
    /* this -> Color 로 생성된 객체의 주소 */
    const changeColor = (color) => this.setState({ color });
    const changesubColor = (color) =>
      this.setState((prevState) => ({ ...prevState, subColor: color }));
    const { color, subColor } = this.state;
    return (
      <>
        <div
          style={{ background: color, width: '100px', height: '100px' }}
        ></div>
        <button
          type="button"
          onClick={() => changeColor('red')}
          onContextMenu={() => changesubColor('red')}
        >
          RED
        </button>
        <button
          type="button"
          onClick={() => changeColor('orange')}
          onContextMenu={() => changesubColor('orange')}
        >
          ORANGE
        </button>
        <button
          type="button"
          onClick={() => changeColor('green')}
          onContextMenu={() => changesubColor('green')}
        >
          GREEN
        </button>
        <div
          style={{ background: subColor, width: '50px', height: '50px' }}
        ></div>
      </>
    );
  }
}

export default Color;
