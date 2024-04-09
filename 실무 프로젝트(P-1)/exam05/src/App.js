import { Routes, Route } from 'react-router-dom';
import loadable from '@loadable/component';

const Home = loadable(() => import('./pages/Home'));
const About = loadable(() => import('./pages/About'));
const BoardList = loadable(() => import('./pages/BoardList'));
const MainLayout = loadable(() => import('./layouts/MainLayout'));
const NotFound = loadable(() => import('./pages/NotFound'));

/*
import Home from './pages/Home';
import About from './pages/About';
import Board from './pages/Board';
import BoardList from './pages/BoardList';
import MainLayout from './layouts/MainLayout';
import NotFound from './pages/NotFound';
*/

const App = () => {
  return (
    <Routes>
      <Route element={<MainLayout />}>
        {/* <Route path="/" element={<MainLayout />}> */}
        <Route index element={<Home />} /> {/* index - 상위 라우터와 동일 */}
        <Route path="about" element={<About />} />
        <Route path="board" element={<BoardList />} />
        <Route path="*" element={<NotFound />} />{' '}
        {/* (* - 전체, 없는 페이지 선택할때 사용) */}
      </Route>
    </Routes>
  );
};

export default App;
