import com.djamware.securepage.UserPasswordEncoderListener
import com.djamware.securepage.CustomUserDetailsService

// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    userDetailsService(CustomUserDetailsService)
}
