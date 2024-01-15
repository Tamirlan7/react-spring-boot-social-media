/* eslint-disable react-refresh/only-export-components */
import { RoutePaths } from "./RouteConstants";
import { lazy } from "react";
import PostsPage from "../pages/PostsPage/PostsPage";
import { IProtectedRoute, IPublicRoute, IUnauthenticatedRoute } from "../types";
import { UserRole } from "../data/UserRole";
const LoginPage = lazy(() => import('@/pages/LoginPage/LoginPage'))
const RegisterPage = lazy(() => import('@/pages/RegisterPage/RegisterPage'))


/* only user routes */
export const protectedRoutes: IProtectedRoute[] = [
    {
        path: RoutePaths.POSTS,
        component: <PostsPage />,
        enabledRoles: [UserRole.ADMIN, UserRole.USER]
    },
]

export const publicRoutes: IPublicRoute[] = [];

/* for those who are not authenticated  */
export const unauthenticatedRoutes: IUnauthenticatedRoute[] = [
    {
        path: RoutePaths.LOGIN,
        component: <LoginPage />
    },
    {
        path: RoutePaths.LOGIN,
        component: <RegisterPage />
    },
];
