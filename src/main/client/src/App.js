import './App.css';
import {Component} from 'react';

class App extends Component{

  state = {};

  componentDidMount() {
    this.getPrices()
  }
  
  getPrices = () => {
    fetch('http://localhost:8080/api/prices')
      .then(response => response.json())
      .then(message => {
        console.log(message);
        this.setState({
          eth1Buy: message.eth1Buy,
          eth1Sell: message.eth1Sell,
          eth2Buy: message.eth2Buy,
          eth2Sell: message.eth2Sell,
          btc1Buy: message.btc1Buy,
          btc1Sell: message.btc1Sell,
          btc2Buy: message.btc2Buy,
          btc2Sell: message.btc2Sell
        })
      })
      .catch(error => {
        console.error(error);
      })
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <table className='priceTable'>
            <tbody>
              <tr>
                <td colSpan={2}></td>
                <td>Buy</td>
                <td>Sell</td>
              </tr>
              <tr>
                <td rowSpan={2}>Coinbase</td>
                <td>Ethereum</td>
                <td>{this.state.eth1Buy}</td>
                <td>{this.state.eth1Sell}</td>
              </tr>
              <tr>
                <td>Bitcoin</td>
                <td>{this.state.btc1Buy}</td>
                <td>{this.state.btc1Sell}</td>
              </tr>
              
              <tr>
                <td rowSpan={2}>Gemini</td>
                <td>Ethereum</td>
                <td>{this.state.eth2Buy}</td>
                <td>{this.state.eth2Sell}</td>
              </tr>
              <tr>
                <td>Bitcoin</td>
                <td>{this.state.btc2Buy}</td>
                <td>{this.state.btc2Sell}</td>
              </tr>
            </tbody>
          </table>

          <br/>

          <p>
            Comparing buy and sell prices for Coinbase and Gemini.<br/>
            According to current prices I recommend buying Bitcoin from
            {(this.state.btc1Buy < this.state.btc2Buy) ? 
              " Coinbase for $" + (this.state.btc2Buy-this.state.btc1Buy).toFixed(2) + " less " :
              " Gemini for $" + (this.state.btc1Buy-this.state.btc2Buy).toFixed(2) + " less " }
            and buying Ethereum from {(this.state.eth1Buy < this.state.eth2Buy) ? 
              " Coinbase for $" + (this.state.eth2Buy-this.state.eth1Buy).toFixed(2) + " less" :
              " Gemini for $" + (this.state.eth1Buy-this.state.eth2Buy).toFixed(2) + " less" }
            <br/>
            I recommend selling Bitcoin on
            {(this.state.btc1Sell < this.state.btc2Sell) ? 
              " Coinbase for $" + (this.state.btc2Sell-this.state.btc1Sell).toFixed(2) + " more " :
              " Gemini for $" + (this.state.btc1Sell-this.state.btc2Sell).toFixed(2) + " more " }
            and selling Ethereum on {(this.state.eth1Sell < this.state.eth2Sell) ? 
              " Coinbase for $" + (this.state.eth2Sell-this.state.eth1Sell).toFixed(2) + " more" :
              " Gemini for $" + (this.state.eth1Sell-this.state.eth2Sell).toFixed(2) + " more" }
          </p>

          <br/>

          <button onClick={this.getPrices}>
            Update prices
          </button>
        </header>
      </div>
    );
  }
}

export default App;
