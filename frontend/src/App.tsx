import React, { useEffect } from 'react';
import { Provider } from 'react-redux';
import Router from '@/router/Router';
import { store } from '@/store';
import { BrowserRouter } from 'react-router-dom';
import { useAppDispatch } from './hooks/reduxHook';
import { setRole } from './slices/userSlice';
import { UserRole } from './data/UserRole';


const App : React.FC = () => {
    const dispatch = useAppDispatch()

    useEffect(() => {
        dispatch(setRole(UserRole.USER))
    }, [dispatch])

    return (
        <BrowserRouter>
            <Provider store={store}>
                <header>

                </header>
                <main>
                    <Router />
                </main>
                <footer>
                    
                </footer>
            </Provider>
        </BrowserRouter>
    )
}

export default App;
