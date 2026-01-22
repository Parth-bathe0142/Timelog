import { useEffect, useState } from 'react'
import './App.css'

function App() {
  const [count, setCount] = useState(0)
  const [pong, setPong] = useState(null);

  useEffect(() => {
    (async () => {
      const response = await fetch("/api/ping");

      if (response.ok) {
        const text = await response.text();

        if (text == "pong") {
          setPong(p => p = text);
        }
      }
    })()
  }, [])

  return (
    <>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
      </div>
      <div>
        {pong ? (<p>Connected! {pong}</p>) : (<p>loading...</p>)}
      </div>
    </>
  )
}

export default App
