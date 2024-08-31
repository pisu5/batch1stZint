import React, { Component } from "react";
class ClassComponent extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
    this.handleClick = this.handleClick.bind(this);
  }

  handleClick() {
    this.setState((preState) => ({
      count: preState.count + 1,
    }));
  }

  render() {
    return (
      <div>
        <button onClick={this.handleClick}>Increnment</button>
        <h1>{this.state.count}</h1>
      </div>
    );
  }
}

export default ClassComponent;
