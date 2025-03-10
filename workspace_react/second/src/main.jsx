import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    {/* App.jsp안 컴포넌트 App를 불러온다. */}
    <App />
  </StrictMode>,
)
