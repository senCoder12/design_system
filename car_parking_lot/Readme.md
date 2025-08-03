Car parking lot design system problem

Requirements
1. Vehicle type - car, bike, truck
2. Payment type - cash, UPI, card
3. Payment depends on country, vehicle  type, duration

Flow diagram/ Business Flow
1. A Vehicle approached
2. Check is slot available for the vehicle type,
3. Allocate the available slot to the specific vehicle and store the entry time
4. Vehicle ready to leave
5. Calculate duration and total payment to pay
6. Select the payment method
7. Accept payment

Optimise the business flow
1. Book the nearest slot

Entity Finding
1. Vehicle
2. ENUM Vehicle type
3. Slot
4. ENUM Slot type
5. ENUM Payment type
