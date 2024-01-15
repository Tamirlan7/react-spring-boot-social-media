import { createSlice, PayloadAction } from '@reduxjs/toolkit'

interface IUserState {
    role: string | null
}

const initialState: IUserState = {
    role: null
}

const userSlice = createSlice({
    name: 'userSlice',
    initialState,
    reducers: {
        setRole(store, action: PayloadAction<string>) {
            store.role = action.payload
        }
    }
})

export const { setRole } = userSlice.actions
export default userSlice.reducer