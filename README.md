#  Cinema Seat Allocation Map

A Java console-based application that simulates a theatre seat booking system using **2D Arrays** and **Object-Oriented Programming (OOP)** concepts.

The system allows users to view seat availability, book contiguous seats for groups, prevent double booking, and calculate real-time occupancy statistics.

---

## Features

- Display seat availability in a grid format
- Find contiguous seats for group bookings
- Prevent double booking
- Calculate occupancy percentage in real time
- Atomic booking (all seats booked or none)
- Menu-driven console interface

---

##  Project Structure

```
CinemaSeatAllocation
│
├── src
│   ├── Main.java
│   ├── BookingSystem.java
│   ├── SeatMap.java
│   ├── Booking.java
│   └── Utils.java
│
├── README.md
└── .gitignore
```

---

##  Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Arrays & Strings
- Console Application

---

##  System Workflow

1. Initialize the seat map.
2. Display available seats.
3. Search for contiguous seats.
4. Validate booking request.
5. Book seats.
6. Update occupancy statistics.

---

##  Algorithm

```text
FOR each row
    count consecutive free seats
    IF count == requested seats
        book all seats
        RETURN success
    END IF
END FOR
RETURN failure
```

### Time Complexity
```
O(R × C)
```

### Space Complexity
```
O(R × C)
```

Where:
- **R** = Number of rows
- **C** = Number of columns

---

##  Sample Output

### Initial Seat Map

```text
O O O O O O
O O O O O O
```

### After Booking 3 Seats

```text
X X X O O O
O O O O O O
```

Legend:

- `O` → Available
- `X` → Booked
- `B` → Blocked (Future Enhancement)

---

##  Future Enhancements

- Database Integration (MySQL)
- JavaFX/Swing GUI
- Online Payment Gateway
- Multi-screen Theatre Support
- Customer Booking History
- Seat Cancellation Feature

---


GitHub: https://github.com/sriram598
