import { ReactNode } from "react"

export interface IRoute {
    path: string
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    component: ReactNode
}

export interface IProtectedRoute extends IRoute {
    enabledRoles: string[]
}

export interface IPublicRoute extends IRoute {
    
}

export interface IUnauthenticatedRoute extends IRoute {

}

export interface Tokens {
    accessToken: string
    refreshToken: string
}
