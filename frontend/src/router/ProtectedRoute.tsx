import React, { PropsWithChildren } from 'react';
import { TOKENS } from '@/config/AppConstants';
import { useAppSelector } from '@/hooks/reduxHook';
import { Tokens } from '@/types';


interface IProtectedRouteProps extends PropsWithChildren {
    enabledRoles: string[]
}

const ProtectedRoute : React.FC<IProtectedRouteProps> = ({ children  }) => {

    return (
        <>
            {children}
        </>
    )
}

export default ProtectedRoute;
