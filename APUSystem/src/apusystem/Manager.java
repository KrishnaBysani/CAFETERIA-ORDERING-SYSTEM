package apusystem;

import java.util.Objects;

public class Manager {
    private String managerName;
    private String managerPassword;

    public Manager(String managerName, String managerPassword) {
        this.managerName = managerName;
        this.managerPassword = managerPassword;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.managerName);
        hash = 61 * hash + Objects.hashCode(this.managerPassword);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Manager other = (Manager) obj;
        if (!Objects.equals(this.managerName, other.managerName)) {
            return false;
        }
        if (!Objects.equals(this.managerPassword, other.managerPassword)) {
            return false;
        }
        return true;
    }

    
    
}
